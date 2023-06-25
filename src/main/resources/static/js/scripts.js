$(document).ready(function () {
    $('#office').change(function () {
        var selectedOffice = $(this).val();
        var departmentSelect = $('#department');
        if (selectedOffice) {
            departmentSelect.prop('disabled', false);
            departmentSelect.val('');
        } else {
            departmentSelect.prop('disabled', true);
        }
        $.ajax({
            type: 'POST',
            url: '/departments',
            data: {office: selectedOffice},
            success: function (response) {
                var departmentSelect = $('#department');
                departmentSelect.empty();
                $.each(response, function (index, department) {
                    departmentSelect.append($('<option></option>').val(department).text(department));
                });
            },
            error: function (xhr) {
                console.log(xhr.responseText);
            }
        });
    });
});

function copyToClipboard() {
    var input = document.getElementById("result");
    input.select();
    document.execCommand("copy");
}

function sendEmail() {
    var emailInput = document.getElementById("result").value;
    if (emailInput) {
        var mailtoLink = "mailto:" + emailInput;
        window.location.href = mailtoLink;
    }
}