<%@page import="Controller.ContactController"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact | View</title>
    </head>
    <body>
        <h2>Contacts List</h2>
        <div class="container">
            <a href="AddContact"><button>ADD NEW CONTACT </button></a>

            <a href="view_group"><button>LIST ALL GROUP</button></a>
        </div><br>
        <hr>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th type="hidden">Group Id</th>
                    <th>Group name</th>
                    <th>Phone</th>
                    <th>Operations</th>
                </tr>
            </thead>
            <tbody>
            <input type="hidden" name="criminal_index" value="">
            <c:forEach var="i" items="<%=ContactController.contactList%>">                      
                <tr> 
                    <td><font><b>${i.id_contact}</b></font></td>
                    <td>${i.first_name}</td>
                    <td><b>${i.last_name}</b></td>
                    <td><font><b>${i.id_group}</b></font></td>
                    <td>${i.name}</td>
                    <td>${i.phone}</td>         
                    <td class="justify-content-center"> 
                        <button onclick="editFunction(${i.id_contact})" class="btn-warning">Edit</button></a><br>
                        <button onclick="deleteFunction(${i.id_contact})" class="btn-danger">Remove</button>
                    </td>
                </tr>       
            </c:forEach>
        </tbody>
    </table>

    <!--EDIT-->
    <form id="editform" action="get_contact">
        <input id="id_contact_edit" type="hidden" name="id_contact_edit" value="">
    </form>   
    <script>
        function editFunction(i) {
            document.getElementById("id_contact_edit").value = i;
            document.getElementById("editform").submit();
        }
    </script>     

    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@9"></script>
    <!--DELETE-->
    <form id="deleteform" method="post" action="delete_contact">
        <input id="id_contact_delete" type="hidden" name="id_contact_delete" value="">
    </form>   
    <script>
        function deleteFunction(i) {
//            Swal.fire({
//                title: '<h2 style="color:white;">Delete this contact?<h2>',
//                text: "Bạn có chắc muốn xóa liên hệ này không?",
//                icon: 'warning',
//                showCancelButton: true,
//                confirmButtonColor: '#3085d6',
//                cancelButtonColor: '#d33',
//                confirmButtonText: 'Xóa ngay',
//                cancelButtonText: 'Hủy bỏ'
//            }).then((result) => {
//                if (result.value) {
//                    document.getElementById("id_contact_delete").value = i;
//                    Swal.fire(
//                            '<h2 style="color:white;">Đang xử lý</h2>',
//                            'Danh sách liên hệ sẽ được cập nhật sau vài giây...',
//                            'success'
//                            );
//                    document.getElementById("deleteform").submit();
//                }
//            });
            document.getElementById("id_contact_delete").value = i;

            document.getElementById("deleteform").submit();
        }
    </script> 
    <br/><br/>
    <a href="https://www.hitwebcounter.com" target="_blank">
            <img src="https://hitwebcounter.com/counter/counter.php?page=7697280&style=0001&nbdigits=5&type=page&initCount=0" title="Total Website Hits" Alt="Web Hits"   border="0" /></a>    
</body>
</html>
