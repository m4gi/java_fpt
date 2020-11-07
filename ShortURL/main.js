/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
	$("button").click(function() {
		$.ajax({
			type : 'POST',
			url : 'http://localhost:8084/ShortURL/index',
			data : JSON.stringify({
				"full_url" : $("#urlinput").val()
			}),
			contentType : "application/json; charset=utf-8",
			success : function(data) {
				$("#shorturltext").val(data.short_url);
			}
		});
	});
});