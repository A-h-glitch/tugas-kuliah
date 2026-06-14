<!DOCTYPE html>
<html>

<head>
    <title>Tugas PBW - Soal 3</title>
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
            text-align: left;
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
            <h2>Daftar Hewan</h2>

            <div class="hasil">
                <?php
                $hewan = [
                    "1. " => "Kucing",
                    "2. " => "Anjing",
                    "3. " => "Monyet",
                    "4. " => "Kodok",
                    "5. " => "Hiu",
                    "6. " => "Paus",
                    "7. " => "Kijang"
                ];

                foreach ($hewan as $no => $nama) {
                    echo $no . $nama . "<br>";
                }
                ?>
            </div>

            <div class="menu">
                <a href="S1.php">Soal 1</a>
                <a href="S2.php">Soal 2</a>
                <a href="S4.php">Soal 4</a>
            </div>
        </div>
    </div>
</body>

</html>

