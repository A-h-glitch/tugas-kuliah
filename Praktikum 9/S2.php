<!DOCTYPE html>
<html>

<head>
    <title>S2</title>
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
            <h2>Bilangan Genap (0 - 10)</h2>

            <div class="hasil">
                <?php
                for ($i = 0; $i <= 10; $i++) {
                    if ($i % 2 == 0) {
                        echo "Angka ke- " . $i . "<br>";
                    }
                }
                ?>
            </div>

            <div class="menu">
                <a href="S1.php">Soal 1</a>
                <a href="S3.php">Soal 3</a>
                <a href="S4.php">Soal 4</a>
            </div>
        </div>
    </div>
</body>

</html>
