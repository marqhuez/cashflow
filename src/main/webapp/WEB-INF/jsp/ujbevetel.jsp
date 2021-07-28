<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>

<div class="row">
    <h3 class="col-12 text-center my-4">Új bevétel felvitele</h3>
    <div class="d-flex justify-content-center">
        <form action="" method="post">
            <label for="osszeg">Összeg</label>
            <input class="form-control mb-3" type="number" name="osszeg" id="osszeg" required>

            <label for="megjegyzes">Megjegyzés</label>
            <textarea class="form-control mb-3" name="megjegyzes" id="megjegyzes" required></textarea>

            <label for="kategoriaId">Kategória</label>
            <select class="form-control mb-3" name="kategoriaId" id="kategoriaId" required>
                <c:forEach var="kategoria" items="${kategoriak}">
                    <option value="${kategoria.id}">${kategoria.nev}</option>
                </c:forEach>
            </select>

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