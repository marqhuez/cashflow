function setKategoriaValue(kategoriaId, element) {

    $("#kategoriaId").val(kategoriaId);

    $(".kategoria-btn").removeClass("kategoria-btn-active");
    element.classList.add("kategoria-btn-active");

    $.ajax({
        type: "POST",
        url: "/cashflow/alkategoriafeldolgoz",
        data: {
            "szuloKategoriaId" : kategoriaId
        },
        success: function(result) {
            if (result !== "") {

                $(".kategoria-btn-container").html(result);

            }
        }
    });
}
