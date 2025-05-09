<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>profile</title>
</head>
<body>
<main>
    <a href="/logout">Log out</a>
    <h1>Welcome!</h1>
    <#if userRole=="ADMIN">
        <a href="/admin">adminka</a>
    </#if>
    <p>Your car(s)</p>
    <table>
        <tr>
            <th>brand</th>
            <th>model</th>
            <th>year</th>
            <th>mileage</th>
            <th>color</th>
        </tr>
        <#if (cars?size > 1)>
            <#list cars as car>
                <tr>
                    <td>${car.brand}</td>
                    <td>${car.model}</td>
                    <td>${car.year}</td>
                    <td>${car.mileage}</td>
                    <td>${car.color}</td>
                </tr>
            </#list>
        </#if>
    </table>
</main>
</body>
</html>