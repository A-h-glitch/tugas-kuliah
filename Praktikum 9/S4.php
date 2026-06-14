<!DOCTYPE html>
<html>

<head>
    <title>Tugas PBW - Soal 4</title>
    <style>
        body {
            font-family: Arial;
            background-color: #f4f4f4;
        }

        .box {
            width: 420px;
            margin: 50px auto;
        }

        .content {
            border: 2px solid black;
            padding: 20px;
            background-color: white;
            text-align: center;
            border-radius: 10px;
        }

        h2 {
            margin-bottom: 15px;
        }

        .hasil {
            font-size: 18px;
            margin: 15px 0;
            color: #333;
        }

        input[type="number"] {
            padding: 8px;
            width: 80%;
            margin: 10px 0;
        }

        button {
            padding: 8px 15px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
        }

        button:hover {
            background-color: #0056b3;
        }

        .menu a {
            display: inline-block;
            margin: 5px;
            padding: 8px 12px;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            border-radius: 5px;
        }

        .menu a:hover {
            background-color: #0056b3;
        }
    </style>
</head>

<body>
    <div class="box">
        <div class="content">
            <h2>Cek Genap / Ganjil</h2>

            <form method="post">
                <input type="number" name="angka" placeholder="Masukkan angka" required>
                <br>
                <button type="submit">Cek</button>
            </form>

            <div class="hasil">
                <?php
                if (isset($_POST['angka'])) {
                    $angka = $_POST['angka'];

                    $hasil = ($angka % 2 == 0) ? "Genap" : "Ganjil";

                    echo "Angka $angka adalah <b>$hasil</b>";
                }
                ?>
            </div>

            <div class="menu">
                <a href="S1.php">Soal 1</a>
                <a href="S2.php">Soal 2</a>
                <a href="S3.php">Soal 3</a>
            </div>
        </div>
    </div>
</body>

</html>
