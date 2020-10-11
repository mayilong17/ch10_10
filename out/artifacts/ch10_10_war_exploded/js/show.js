function query(id) {
    location.href='queryServlet?id='+id+'&comm=query';
}
function update(id) {
   location.href='queryServlet?id='+id+'&comm=update';
}
function del(id) {
    var flang=confirm("确定删除这条信息吗?");
    if(flang==true){
        location.href='delServlet?id='+id;
    }
}

function add() {
    location.href='addUser.jsp';
}