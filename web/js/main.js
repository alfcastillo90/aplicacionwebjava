/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener('load',function(){
    document.getElementById('btn-login').addEventListener('click',function(){
       var username = document.getElementById("username").value;
       var password = document.getElementById("password").value;
       var flag = false;
       if(username.length>0  && password.length>0){
           flag = true;
       }
       else {
           alert("Por favor indique todos los campos");
       }
       if(flag){
           document.getElementById('form-login').submit();
       }
    });
});

