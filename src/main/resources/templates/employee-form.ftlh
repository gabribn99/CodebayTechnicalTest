<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Goldeneye email generator</title>
    <link rel="stylesheet" href="/css/styles.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="/js/scripts.js"></script>
</head>
<body>
<div class="container">
    <div class="form-box">
        <h1>Employee Form</h1>
        <form action="/employee" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required><br>

            <label for="surname">Surname:</label>
            <input type="text" id="surname" name="surname" required><br>

            <label for="office">Office:</label>
            <select id="office" name="office" required>
                <option value="" disabled selected>-- Select an office --</option>
                <#list offices as office>
                    <option value="${office.name}">${office.name}</option>
                </#list>
            </select><br>

            <label for="department">Department:</label>
            <select id="department" name="department" required disabled>
                <option value="" disabled selected>-- Select an office first --</option>
            </select>

            <button type="submit">Submit</button>
        </form>
    </div>
</div>
</body>
</html>