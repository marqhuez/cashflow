<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>

<div class="row">
    <h3 class="col-12 text-center my-4">Új kiadás felvitele</h3>

    <div class="col-2">
        <button class="btn btn-sm btn-warning" onclick="window.history.back()"><i class="fas fa-arrow-left"></i> Vissza</button>
    </div>

    <div class="d-flex justify-content-center">
        <form class="uj-adat-form" action="" method="post">
            <label for="osszeg">Összeg</label>
            <input class="form-control mb-3" type="number" name="osszeg" id="osszeg" required>

            <label for="megjegyzes">Megjegyzés</label>
            <textarea class="form-control mb-3" name="megjegyzes" id="megjegyzes" required></textarea>

            <input type="hidden" name="kategoriaId" id="kategoriaId" required>

            <label id="kategoria-label">Kategória</label>
            <div class="kategoria-btn-container mx-auto">
            <c:forEach var="kategoria" items="${kategoriak}">
                <button
                        <c:if test="${kategoria.isSzulo}">
                            data-szulo="true"
                        </c:if>

                        data-id="${kategoria.id}"

                        <c:if test="${kategoria.isSzulo}">
                            onclick="getAlkategoria(${kategoria.id}, this)"
                        </c:if>

                        <c:if test="${!kategoria.isSzulo}">
                            onclick="setKategoriaValue(${kategoria.id})"
                        </c:if>

                        type="button"
                        class="btn btn-sm btn-primary m-1 kategoria-btn">${kategoria.nev}
                </button>
            </c:forEach>
            </div>

            <label for="szamlaId">Számla</label>
            <select class="form-control mb-3" name="szamlaId" id="szamlaId" required>
                <c:forEach var="szamla" items="${szamlak}">
                    <option value="${szamla.id}">${szamla.nev}</option>
                </c:forEach>
            </select>

            <button type="submit" class="btn btn-success">Mentés</button>
        </form>
    </div>
</div>

<%@ include file="footer.jsp" %>