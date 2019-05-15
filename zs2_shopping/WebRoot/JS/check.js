   function focus_username(){
            document.getElementById("user_res").innerHTML="<font color='#f00'>请输入用户名</font>";
        }
        //当用户名失去焦点时
        function blur_username(){
            var user_value=document.getElementsByName("user.username")[0].value;
            if(user_value.length==0){
            document.getElementById("user_res").innerHTML="<font color='#f00'>你没有输入用户名</font>";
                    return false;
                    //判断其长度是否在5~10之间  如果不在就提示用户
            }else if(user_value.length<5 ||user_value.length>10)
            {
            document.getElementById("user_res").innerHTML="<font color='#f00'>用户名长度必须在5-10之间</font>";
                    
                    return false;
            }else if(!checkUser(user_value)){
                //用户名还有特殊符号
            document.getElementById("user_res").innerHTML="<font color='#f00'>用户名含有特殊符号</font>";
                    return false;
            }else{
                //用户名合法
            document.getElementById("user_res").innerHTML="<font color='#00f'>用户名合法</font>";
                    return true;
            }

        }

        //密码获取焦点时
        function focus_password(){
            document.getElementById("pass_res").innerHTML="<font color='#f00'>请输入密码</font>";
        }
        //密码失去焦点时
        function blur_password(){
            var user_value=document.getElementsByName("user.password")[0].value;
            if(user_value.length===0){
            document.getElementById("pass_res").innerHTML="<font color='#f00'>你没有输入密码</font>";
                    return false;
                    //判断其长度是否在5~18之间  如果不在就提示用户
            }else if(user_value.length<5||user_value.length>18)
            {
            document.getElementById("pass_res").innerHTML="<font color='#f00'>用密码长度必须在5-18之间</font>";
                    
                    return false;
            }else{
                //密码合法
            document.getElementById("pass_res").innerHTML="<font color='#00f'>密码合法</font>";
                    return true;
            }
        }
       
        
        
        function blur_repeat(){
            var user_value=document.getElementsByName("repeat")[0].value;
            if(user_value.length==0){
            document.getElementById("pass_rep").innerHTML="<font color='#f00'>你没有确认输入密码</font>";
                    return false;
                    
            }else if(user_value!=document.getElementsByName("user.password")[0].value)
            {
            document.getElementById("pass_rep").innerHTML="<font color='#f00'>密码不匹配</font>";
                    
                    return false;
            }else{
            	document.getElementById("pass_rep").innerHTML="<font color='#00f'>密码匹配</font>";
            	return true;
            }
        }
        

         function checkUser(user){
            var arr=["<",">","#","?","%","!"," ","|",";","[","-"];
            var arr_length=arr.length;
            var user_length=user.length;

            for(var i=0;i<arr_length;i++){
                for(var j=0;j<user_length;j++){
                    if(arr[i]===user.charAt(j)){
                        return false;
                    }
                }
            
            }
            //表示用户名合法
             return true;
         }
         

         //提交提交表单验证
          function checkForm(){
            var user_flag=blur_username();
            var pass_flag=blur_password();
            var repe_flag=blur_repeat();
            if(user_flag && pass_flag && repe_flag){
                alert("提交合法表单");
                 return true;
            }else{
            
                alert("输入不合法");
                return false;
            }
          
          }
 