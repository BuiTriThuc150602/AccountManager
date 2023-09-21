<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.fit.btt.accountmanager.modals.Account" %>
<%@ page
        import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Table with Search and Modal</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.7.1.min.js" defer></script>
    <script src="js/bootstrap.min.js" defer></script>
    <style>
      .table-container {
        max-height: 300px;
        overflow-y: auto;
      }
    </style>
</head>
<body>
<div class="container mt-4">
    <h1>Table with Search and Modal</h1>
    <div class="container row">
        <input type="text" class="col-8" id="searchInput" placeholder="Search...">
        <button type="button" class="btn btn-primary col-4" data-toggle="modal" data-target="#updateModal">
            Update nExtPoint
        </button>
    </div>
    <div class="table-container"> <!-- Thêm container cho bảng -->
        <table class="table table-bordered table-striped table-hover table-responsive">
            <thead>
            <tr class="table-info">
                <th>cAccName</th>
                <th>dLoginDate</th>
                <th>dLogoutDate</th>
                <th>iClientID</th>
                <th>nUserIP</th>
                <th>nUserPort</th>
                <th>nFreeType</th>
                <th>nExtPoint</th>
                <th>nExtPoint1</th>

            </tr>
            </thead>
            <tbody>
            <!-- Duyệt và hiển thị dữ liệu từ list -->
            <%--            <c:forEach var="acc" items="${listAcc}">--%>
            <c:forEach items="${listAcc}" var="acc">


                <tr>
                    <td>${acc.cAccName}</td>
                    <td>${acc.dLoginDate}</td>
                    <td>${acc.dLogoutDate}</td>
                    <td>${acc.iClientID}</td>
                    <td>${acc.nUserIP}</td>
                    <td>${acc.nUserIPPort}</td>
                    <td>${acc.nFreeType}</td>
                    <td>${acc.nExtPoint}</td>
                    <td>${acc.nExtPoint1}
                        <span class="border border-info-subtle"><a  href="/controller?action=update&id=${acc.cAccName}">Update</a></span>
                    </td>

                </tr>
            </c:forEach>


            </tbody>
        </table>
    </div>
    <div class="container p-5 my-5 bg-info text-white">
        <h3>Tổng Xu : <span>${sumOfnExtPoint1}</span></h3>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="updateModal" tabindex="-1" role="dialog"
     aria-labelledby="updateModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="updateModalLabel">Update nExtPoint</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <label for="txtNExtPoint">nExtPoint</label>
                        <input type="text" class="form-control" id="txtNExtPoint"
                               placeholder="Enter nExtPoint">
                    </div>
                    <div class="form-group">
                        <label for="txtNewValue">New Value</label>
                        <input type="text" class="form-control" id="txtNewValue"
                               placeholder="Enter New Value">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>

</body>
</html>
