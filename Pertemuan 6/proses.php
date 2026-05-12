<!DOCTYPE html>
<html lang="id">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ringkasan Pendaftaran - Koperasi Mahasiswa</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background: #f4f4f4;
        }

        .container {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #333;
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }

        th,
        td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background: #4CAF50;
            color: white;
        }

        .total {
            font-weight: bold;
            font-size: 18px;
            background: #e8f5e8;
        }

        .error {
            color: red;
            font-size: 18px;
            text-align: center;
        }

        .back {
            text-align: center;
            margin-top: 20px;
        }

        .back a {
            color: #4CAF50;
            text-decoration: none;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>📋 Ringkasan Pendaftaran Belanja</h1>
        <?php
        if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
            echo '<p class="error">Error: Gunakan form untuk mengakses halaman ini.</p>';
        } else {
            $nama = htmlspecialchars($_POST['nama'] ?? '');
            $nim = htmlspecialchars($_POST['nim'] ?? '');
            $email = htmlspecialchars($_POST['email'] ?? '');
            $layanan = $_POST['layanan'] ?? '';

            define('PAJAK', 0.15);

            $harga = array(
                'pulpen' => 30000,
                'buku' => 10000,
                'penggaris' => 5000
            );

            $subtotal = 0;
            $items = array();

            if (isset($_POST['pulpen']) && (int) $_POST['qty_pulpen'] > 0) {
                $qty = (int) $_POST['qty_pulpen'];
                $items['Pulpen'] = $qty;
                $subtotal += $harga['pulpen'] * $qty;
            }
            if (isset($_POST['buku']) && (int) $_POST['qty_buku'] > 0) {
                $qty = (int) $_POST['qty_buku'];
                $items['Buku Tulis'] = $qty;
                $subtotal += $harga['buku'] * $qty;
            }
            if (isset($_POST['penggaris']) && (int) $_POST['qty_penggaris'] > 0) {
                $qty = (int) $_POST['qty_penggaris'];
                $items['Penggaris'] = $qty;
                $subtotal += $harga['penggaris'] * $qty;
            }

            $pajak = $subtotal * PAJAK;

            $biaya_layanan = 0;
            if ($layanan == 'Reguler') {
                $biaya_layanan = 0;
            } elseif ($layanan == 'Prioritas') {
                $biaya_layanan = 50000;
            } else {
                $layanan = 'Tidak valid';
                $biaya_layanan = 0;
            }

            $kargo = 100;
            $total = $subtotal + $pajak + $biaya_layanan + $kargo;

            if (empty($items)) {
                echo '<p class="error">⚠️ Status: Tidak ada barang yang dipilih! Silakan pilih minimal satu item.</p>';
            } else {
                echo '<table>';
                echo '<tr><th colspan="2">Data Pemesan</th></tr>';
                echo '<tr><td>Nama:</td><td>' . $nama . '</td></tr>';
                echo '<tr><td>NIM:</td><td>' . $nim . '</td></tr>';
                echo '<tr><td>Email:</td><td>' . $email . '</td></tr>';
                echo '<tr><td>Layanan:</td><td>' . $layanan . ' (Biaya: Rp ' . number_format($biaya_layanan, 0, ',', '.') . ')</td></tr>';

                echo '<tr><th colspan="2">Daftar Item Dipilih</th></tr>';
                foreach ($items as $barang => $qty) {
                    $key = strtolower(str_replace(' ', '', $barang));
                    $h = $harga[$key];
                    $total_item = $h * $qty;
                    echo '<tr><td>' . $barang . ' (x' . $qty . ' @ Rp ' . number_format($h, 0, ',', '.') . ')</td><td style="text-align:right;">Rp ' . number_format($total_item, 0, ',', '.') . '</td></tr>';
                }

                echo '<tr><td>Subtotal:</td><td style="text-align:right;">Rp ' . number_format($subtotal, 0, ',', '.') . '</td></tr>';
                echo '<tr><td>Pajak (' . (PAJAK * 100) . '%):</td><td style="text-align:right;">Rp ' . number_format($pajak, 0, ',', '.') . '</td></tr>';
                echo '<tr><td>Biaya Layanan:</td><td style="text-align:right;">Rp ' . number_format($biaya_layanan, 0, ',', '.') . '</td></tr>';
                echo '<tr><td>Kargo:</td><td style="text-align:right;">Rp ' . number_format($kargo, 0, ',', '.') . '</td></tr>';
                echo '<tr class="total"><td>Total Akhir:</td><td style="text-align:right;">Rp ' . number_format($total, 0, ',', '.') . '</td></tr>';
                echo '</table>';
                echo '<p style="text-align:center; font-size:18px;"><strong>Pendaftaran berhasil! Total bayar: Rp ' . number_format($total, 0, ',', '.') . '</strong></p>';
            }
        }
        ?>
        <div class="back">
            <a href="form.html">← Kembali ke Form</a>
        </div>
    </div>
</body>

</html>