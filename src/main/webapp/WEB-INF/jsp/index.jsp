<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>

<div class="row">
    <h2 class="col-12 text-center my-4">Egyenleg: <fmt:formatNumber value = "${egyenleg}" type = "currency" currencySymbol="" maxFractionDigits="0"/> Ft</h2>
    <div class="col-12 d-flex justify-content-center">
        <div class="m-3 mx-5 d-flex flex-column">
            <a href="/cashflow/ujbevetel" class="btn btn-success m-2">Új bevétel</a>
            <a href="/cashflow/bevetel" class="btn btn-success m-2">Összess bevétel</a>
        </div>
        <div class="m-3 mx-5 d-flex flex-column">
            <a href="/cashflow/ujkiadas" class="btn btn-success m-2">Új kiadás</a>
            <a href="/cashflow/kiadas" class="btn btn-success m-2">Összess kiadás</a>
        </div>
        <div class="m-3 mx-5 d-flex flex-column">
            <a class="btn btn-success m-2">Szűrés</a>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>