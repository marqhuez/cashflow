function setKategoriaValue(kategoriaId) {

    $("#kategoriaId").val(kategoriaId);

    setActiveBtn("");

}

function getAlkategoria(kategoriaId, element) {

    if(element.dataset.szulo) {
        $.ajax({
            type: "POST",
            url: "/cashflow/alkategoriafeldolgoz",
            data: {
                "type": "kategoriaSelect",
                "szuloKategoriaId": kategoriaId
            },
            success: function (result) {
                if (result !== "") {

                    $(".kategoria-btn-container").html(result);
                    setActiveBtn("");

                }
            }
        });
        var selectedBtnText = $("button[onclick='getAlkategoria(" + kategoriaId + ", this)']").text();
        $("#kategoria-label").append("<span id='alkategoria-label'>: " + selectedBtnText + "</span>");
    }
}

function kategoriaBackButton() {

    $("#alkategoria-label").remove();

    $.ajax({
        type: "POST",
        url: "/cashflow/alkategoriafeldolgoz",
        data: {
            "type" : "back",
            "szuloKategoriaId" : ""
        },
        success: function(result) {
            if (result !== "") {

                $(".kategoria-btn-container").html(result);
                setActiveBtn("back:   ");

            }
        }
    });
}

function setActiveBtn(string) {
    console.log(string)
    $(".kategoria-btn").removeClass("kategoria-btn-active")
    $(".kategoria-btn").each(function (element) {

        console.log(this.dataset.id +"    "+ $("#kategoriaId").val())

        if (this.dataset.id === $("#kategoriaId").val()) {

            $(this).addClass("kategoria-btn-active");
            return false;
        }
    });
}