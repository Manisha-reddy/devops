function fun1()
{
	var gender="";
	var a=document.registration.userid.value;
	var b=document.registration.pass.value;
	var c=document.registration.name.value;
	var d=document.getElementsByName("msex");
	/*if(d[0].checked==true)
		{
		gender="male";
		}
	else if(d[1].checked==true)
		{
		gender="female";
		}
	else
		{
		gender="other";
		}*/
    var e=document.registration.address.value;
	var f=document.registration.country.value;
	var g=document.registration.email.value;
	var h=document.registration.zipcode.value;
	
	var j=document.getElementsByName("en");
	var k=" ";
    for(var i=0;i<j.length;i++)
	 {
	  if(j[i].checked)
		{
		k=k+j[i].value+" ";
		}
	}
//alert(k);
alert("hi hello how r u"+""+a+" "+b+" "+c+" "+gender+" "+e+" "+f+" "+g+" "+h+" "+k);	
if(fun2(a,1,12))
	{
	if(fun3(b,1,10))
		{
		if(allLetter(c))
		 {
			if(fun4(e))
				{
				if(countryselect(f))
					{
					if(allnumeric(h))
						{
						if(ValidateEmail(g))
							{
							if(gen(d))
								{
								
								
								
								}
							}
						}
					}
				}
			 }
			}
	}
return false;

}

function fun2(a,mx,my)
{
var uid_len=a.length;
if(uid_len==0||uid_len>=my||uid_len<mx)
{
	alert("user id shd nt be empty/length be between"+mx+"to"+my);
	uid.focus();
	return false;
}
return true;
}

function fun3(b,mx,my)
{
var pid_len=b.length;
if(pid_len==0||pid_len>=my||pid_len<mx)
{
	alert("password shd nt be empty/length be between"+mx+"to"+my);
	pid.focus();
	return false;
}
return true;
}

function allLetter(c)
{
var letters=/^[A-Za-z]+$/;
if(c.match(letters))
	{
	return true;
	}
else
	{
	alert('username must have alphabets only');
	c.focus();
	return false;
	}
}

function fun4(e)
{
var letters=/^[0-9A-Za-z@-]+$/;
if(e.match(letters))
	{
	return true;
	}
else
	{
	alert('user address must have alphabets only');
	e.focus();
	return false;
	}
}
function countryselect(f)
{
if(f=="Default")
	{
	alert('select ur country frm the list');
	f.focus();
	return false;
	}
else
	{
	return true;
	}
}

function allnumeric(h)
{
var numbers=/^[0-9]+$/;
if(h.match(numbers))
	{
	return true;
	}
else
	{
	alert('zipcode must have numeric values nly');
	h.focus();
	return false;
	}
}
function ValidateEmail(g)
{
	var mailformat=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(g.match(mailformat))
	{
	return true;
	}
else
	{
	alert("u have entered an invalid email address");
	g.focus();
	return false;
	}
}

function gen(d)
{
var x=0;
if(d[0].checked==true)
	{
	x++;
	gender="male";
	}
 if(d[1].checked==true)
	{
	x++;
	gender="female";
	}
if(d[2].checked==true)
	{
	x++;
	gender="other";
	}
if(x==0)
	{
	alert('select male or female');
	d.focus();
	return false;
	}
else
	{
	alert('success');
	window.location.reload()
	return true;
	}

}



