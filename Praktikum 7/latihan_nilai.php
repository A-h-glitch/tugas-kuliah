<!DOCTYPE html>
<html>

<head>
    <title>Latihan Nilai</title>
    <style>
    .container {
        display: flex;
        width: 100%;
        padding: 20px;
    }

    .content {
        border: 2px solid black;
        padding: 20px;
        width: 400px;
        margin: 40px auto;
    }
    </style>
</head>

<body>
    <div class="container">
        <section class="content">
            <h2>Form Input Nilai Mahasiswa</h2>

            <form method="post">
                Nama: <input type="text" name="nama"><br><br>
                Nilai: <input type="number" name="nilai"><br><br>
                <input type="submit" name="proses" value="Proses">
            </form>

            <?php
if (isset($_POST['proses'])) {
    $nama = $_POST['nama'];
    $nilai = $_POST['nilai'];
    $predikat = "";
    $status = "";

    if ($nilai >= 85 && $nilai <= 100) {
        $predikat = "A";
    } else if ($nilai >= 75) {
        $predikat = "B";
    } else if ($nilai >= 65) {
        $predikat = "C";
    } else if ($nilai >= 50) {
        $predikat = "D";
    } else if ($nilai >= 0) {
        $predikat = "E";
    } else {
        $predikat = "Tidak valid";
    }

    if ($predikat == "A" || $predikat == "B" || $predikat == "C") {
    $status = "Lulus";
} else if ($predikat == "D" || $predikat == "E") {
    $status = "Tidak Lulus";
} else {
    $status = "-";
}

    echo "<h3>Hasil:</h3>";
    echo "Nama: $nama <br>";
    echo "Nilai: $nilai <br>";
    echo "Predikat: $predikat<br>";
    echo "<b>Status: $status</b>";
}
?>
        </section>
        </section>
</body>

</html>