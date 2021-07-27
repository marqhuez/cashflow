<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>

<div class="row">
    <h3 class="col-12 text-center my-4">Új bevétel felvitele</h3>
    <div class="d-flex justify-content-center">
        <form action="" method="post">
            <label for="osszeg">Összeg</label>
            <input class="form-control mb-3" type="number" name="osszeg" id="osszeg">

            <label for="megjegyzes">Megjegyzés</label>
            <textarea class="form-control mb-3" name="megjegyzes" id="megjegyzes"></textarea>

            <label for="kategoria">Kategória</label>
            <select class="form-control mb-3" name="kategoria" id="kategoria">
                <c:forEach var="kategoria" items="${kategoriak}">
                    <option value="${kategoria.id}">${kategoria.nev}</option>
                </c:forEach>
            </select>

            <label for="szamla">Számla</label>
            <select class="form-control mb-3" name="szamla" id="szamla">
                <c:forEach var="szamla" items="${szamlak}">
                    <option value="${szamla.id}">${szamla.nev}</option>
                </c:forEach>
            </select>

            <button type="submit" class="btn btn-success">Mentés</button>
        </form>
    </div>
</div>

<%@ include file="footer.jsp" %>