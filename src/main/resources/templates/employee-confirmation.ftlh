<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/css/styles.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="/js/scripts.js"></script>
    <script src="https://kit.fontawesome.com/2d83aab01a.js" crossorigin="anonymous"></script>
    <title>Goldeneye email generated</title>
</head>
<body>
<div class="container">
    <div class="confirmation-box">
        <h1>Generated Email</h1>
        <p>The email has been generated successfully!</p>
        <input id="result" type="text" class="email-info" value="${email}" readonly>
        <button onclick="copyToClipboard()"><i class="fa-solid fa-copy"></i></button>
        <button onclick="sendEmail()"><i class="fa-solid fa-envelope"></i></button>
    </div>
</div>
</body>
</html>