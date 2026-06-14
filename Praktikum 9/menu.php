<!DOCTYPE html>
<html>

<head>
    <title>Menu Utama</title>
    <style>
        body {
            font-family: Arial;
            background-color: #f4f4f4;
        }

        .box {
            width: 420px;
            margin: 100px auto;
        }

        .content {
            border: 2px solid black;
            padding: 20px;
            background-color: white;
            text-align: center;
            border-radius: 10px;
        }

        h2 {
            margin-bottom: 20px;
        }

        .menu a {
            display: block;
            margin: 10px 0;
            padding: 10px;
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
            <h2>Menu Tugas PBW</h2>

            <div class="menu">
                <?php
                echo '
                <a href="S1.php">Soal 1</a>
                <a href="S2.php">Soal 2</a>
                <a href="S3.php">Soal 3</a>
                <a href="S4.php">Soal 4</a>
                ';
                ?>
            </div>

        </div>
    </div>
</body>

</html>
