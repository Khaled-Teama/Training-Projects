let x = document.getElementById("bu1");

x.onclick = function() {
    if(x.getAttribute("href") === ""){
        x.setAttribute("href","https://www.facebook.com/");
        x.textContent = "clicked";
    }else{
        x.textContent ="clicked";
        return;
    }
}