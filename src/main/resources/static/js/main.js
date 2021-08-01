$("#kategoriaSelector").on("change", function() {
    var kategoriaId = $(this).val();
    //console.log($(this).val());

    $("#kategoriaId").val(kategoriaId);

    $.ajax({
        type: "POST",
        url: "/cashflow/alkategoriafeldolgoz",
        data: {
            "szuloKategoriaId" : kategoriaId
        },
        success: function(result) {
            $("#alkategoriaSelectorLabel").remove();
            $("#alkategoriaSelector").remove();

            if (result !== "") {
                console.log(result);
                $("#kategoriaSelector").after(result);

                $("#alkategoriaSelector").on("change", function() {
                    $("#kategoriaId").val($(this).val());
                });
            }
        }
    });
});
