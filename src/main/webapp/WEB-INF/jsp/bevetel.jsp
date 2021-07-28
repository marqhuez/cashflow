<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>

<div class="row">
    <h3 class="col-12 text-center my-4">Bevétel</h3>

    <div class="col-2">
        <button class="btn btn-sm btn-warning" onclick="window.history.back()"><i class="fas fa-arrow-left"></i> Vissza</button>
    </div>

    <table class="table table-striped table-hover">
        <thead>
            <tr>
                <td>Összeg</td>
                <td>Megjegyzés</td>
                <td>Kategória</td>
                <td>Időpont</td>
                <td>Számla</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="bevetel" items="${bevetelek}">
                <tr>
                    <td><fmt:formatNumber value = "${bevetel.osszeg}" type = "currency" currencySymbol="" maxFractionDigits="0"/> Ft</td>
                    <td>${bevetel.megjegyzes}</td>
                    <td>${bevetel.kategoria.nev}</td>
                    <td><fmt:formatDate pattern = "yyyy-MM-dd" value = "${bevetel.idopont}" /></td>
                    <td>${bevetel.szamla.nev}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="footer.jsp" %>