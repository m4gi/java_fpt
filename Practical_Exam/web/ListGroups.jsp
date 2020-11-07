<%@page import="controller.GroupController"%>
<%@page import="controller.ContactController"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Group | View</title>
    </head>
    <body>
        <h2>Group List</h2>
        <div class="container">
            <a href="AddGroup"><button class="btn-success">ADD NEW GROUP</button>
            <a href="view_contact"><button class="btn-success">LIST ALL CONTACT</button></a>
        </div><br>
        <hr>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Operations</th>
                </tr>
            </thead>
            <tbody>
            <input type="hidden" name="criminal_index" value="">
            <c:forEach var="i" items="<%=GroupController.groupList%>">                      
                <tr> 
                    <td><font><b>${i.id_group}</b></font></td>
                    <td><b>${i.name}</b></td>
                    <td>${i.description}</td>    
                    <td class="justify-content-center"> 
                        <button onclick="deleteFunction(${i.id_group})" class="btn-danger">Remove</button>
                    </td>
                </tr>       
            </c:forEach>
        </tbody>
    </table>
        
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@9"></script>
    <!--DELETE-->
    <form id="deleteform" method="post" action="delete_group">
        <input id="id_group_delete" type="hidden" name="id_group_delete" value="">
    </form>   
    <script>
                        function deleteFunction(i) {
                            Swal.fire({
                                title: '<h2 style="color:white;">Delete this group?</h2>',
                                text: "Bạn có chắc muốn xóa nhóm này không?",
                                icon: 'warning',
                                showCancelButton: true,
                                confirmButtonColor: '#3085d6',
                                cancelButtonColor: '#d33',
                                confirmButtonText: 'Xóa ngay',
                                cancelButtonText: 'Hủy bỏ'
                            }).then((result) => {
                                if (result.value) {
                                    document.getElementById("id_group_delete").value = i;
                                    Swal.fire(
                                            '<h2 style="color:white;">Đang xử lý</h2>',
                                            'Danh sách nhóm sẽ được cập nhật sau vài giây...',
                                            'success'
                                            );
                                    document.getElementById("deleteform").submit();
                                }
                            });
                        }
    </script> 
</body>
</html>
