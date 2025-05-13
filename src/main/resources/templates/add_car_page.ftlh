<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>add car</title>
</head>
<body>
<main>
    <form action="/addCar" method="post">
        <input type="text" name="brand" placeholder="brand">
        <input type="text" name="model" placeholder="model">
        <input type="number" name="year" placeholder="year">
        <input type="number" name="mileage" placeholder="mileage">
        <input type="text" name="color" placeholder="color">
        <input type="submit" value="add">
    </form>
</main>
</body>
</html>