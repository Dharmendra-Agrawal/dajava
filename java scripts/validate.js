function validate(){
			var data= document.getElementById("myInput").value;
			var msg= document.getElementById("msg");
			if(1<data && data<100){
				msg.innerHTML="data is valid you can proceed";
			}else{
				msg.innerHTML="data is invalid";
			}
				
		}