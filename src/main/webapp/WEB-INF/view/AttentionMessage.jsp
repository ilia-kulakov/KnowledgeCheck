<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${attentionMessage != null}">
    <div style="background-color: limegreen; width: 60%; margin: 10px;">${attentionMessage}</div>
</c:if>