package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javapapers.java.social.facebook.FBConnection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

//     response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
//     response.setHeader("Pragma","no-cache");
//         response.setHeader("Expires", "0");
//        
	FBConnection fbConnection = new FBConnection();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://apis.google.com/js/platform.js\"  defer></script>\n");
      out.write("        <meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\n");
      out.write("<meta http-equiv=\"Expires\" content=\"Sat, 01 Dec 2001 00:00:00 GMT\">\n");
      out.write("        <meta name=\"google-signin-scope\" content=\"profile email\">\n");
      out.write("        <meta name=\"google-signin-client_id\"\n");
      out.write("     content=\"536466055968-d0ptk0e0dhjfm06et254e7k5kgejj2t6.apps.googleusercontent.com\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap/bootstrap.min.css\">\n");
      out.write("  <!-- slick slider -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/slick/slick.css\">\n");
      out.write("  <!-- themefy-icon -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/themify-icons/themify-icons.css\">\n");
      out.write("  <!-- animation css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/animate/animate.css\">\n");
      out.write("  <!-- aos -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/aos/aos.css\">\n");
      out.write("  <!-- venobox popup -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/venobox/venobox.css\">\n");
      out.write("\n");
      out.write("  <!-- Main Stylesheet -->\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("  \n");
      out.write("  <!--Favicon-->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("  <link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write(" \n");
      out.write("  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function preventBack() { \n");
      out.write("                window.history.forward(); \n");
      out.write("        }\n");
      out.write("        setTimeout(\"preventBack()\", 0);\n");
      out.write("        window.onunload = function () { \n");
      out.write("            null \n");
      out.write("        };\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("  \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .aParenthai\n");
      out.write("            {\n");
      out.write("                float: left;\n");
      out.write("                clear: none; \n");
      out.write("            }\n");
      out.write("            #d1\n");
      out.write("            {\n");
      out.write("                float:center;\n");
      out.write("                margin-left: 300px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #logo{\n");
      out.write("                opacity:0.5;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    <script src=\"plugins/jQuery/jquery.min.js\"></script>    \n");
      out.write("       <!-- <div class=\"modal fade\" id=\"signupModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("       <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("        <div class=\"modal-content rounded-0 border-0 p-4\">-->\n");
      out.write("       \n");
      out.write(" <section class=\"page-title-section overlay\" data-background=\"images/backgrounds/page-title.jpg\">\n");
      out.write("          \n");
      out.write("  <div class=\"container\">\n");
      out.write("      \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-8\">\n");
      out.write("          <a href=\"login.jsp\"><img id = \"logo\" src=\"images/logo.png\" alt=\"logo\"></a>\n");
      out.write("        <ul class=\"list-inline custom-breadcrumb\">\n");
      out.write("            \n");
      out.write("          &emsp;<li class=\"list-inline-item\"><a class=\"h2 text-primary font-secondary\" href=\"@@page-link\">LOGIN</a></li>\n");
      out.write("          <li class=\"list-inline-item text-white h3 font-secondary @@nasted\"> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href = \"index.jsp\">Skip</a></li>\n");
      out.write("        </ul>      \n");
      out.write("          \n");
      out.write("      <div class=\"modal-header border-0\">\n");
      out.write("                \n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form action=\"#\" class=\"row\" >\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <input type=\"text\" class=\"form-control mb-3\" id=\"loginId\" name=\"loginId\" placeholder=\"Email\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <input type=\"password\" class=\"form-control mb-3\" id=\"loginPassword\" name=\"loginPassword\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <span> \n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" onClick=\"login()\">LOGIN</button>                          \n");
      out.write("                    </div>\n");
      out.write("                </form>         \n");
      out.write("                          <br> \n");
      out.write("                                          \n");
      out.write("                                <div>\n");
      out.write("                                       \n");
      out.write("                                    <a href =\"");
      out.print(fbConnection.getFBAuthUrl());
      out.write("\">\n");
      out.write("                                    <img style=\"margin-top: 10px; \" src=\"./img/facebookloginbutton.png\" />\n");
      out.write("                                    </a>\n");
      out.write("                              </div>          \n");
      out.write("                        <br>\n");
      out.write("                       <div  class=\"g-signin2\" >\n");
      out.write("                                <button data-onsuccess=\"onSignIn\" onclick=\"googlelogin()\"></button>\n");
      out.write("                        </div>\n");
      out.write("                        <br><br>\n");
      out.write("                        <a href=\"Register.jsp\" class=\"btn btn-primary\" >Register</a>                        \n");
      out.write("                    \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("     \n");
      out.write("     \n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    function onSignIn(googleUser) {\n");
      out.write("        // Useful data for your client-side scripts:\n");
      out.write("        var profile = googleUser.getBasicProfile();\n");
      out.write("        console.log(\"ID: \" + profile.getId()); // Don't send this directly to your server!\n");
      out.write("        console.log('Full Name: ' + profile.getName());\n");
      out.write("        console.log('Given Name: ' + profile.getGivenName());\n");
      out.write("        console.log('Family Name: ' + profile.getFamilyName());\n");
      out.write("        console.log(\"Image URL: \" + profile.getImageUrl());\n");
      out.write("        console.log(\"Email: \" + profile.getEmail());\n");
      out.write("\n");
      out.write("        // The ID token you need to pass to your backend:\n");
      out.write("        var id_token = googleUser.getAuthResponse().id_token;\n");
      out.write("        console.log(\"ID Token: \" + id_token);\n");
      out.write("      }\n");
      out.write("       function signOut() {\n");
      out.write("    var auth2 = gapi.auth2.getAuthInstance();\n");
      out.write("    auth2.signOut().then(function () {\n");
      out.write("      console.log('User signed out.');\n");
      out.write("    });\n");
      out.write("  }\n");
      out.write("    \n");
      out.write("    window.fbAsyncInit = function() {\n");
      out.write("    FB.init({\n");
      out.write("      appId      : '449742522606357',\n");
      out.write("      cookie     : true,\n");
      out.write("      xfbml      : true,\n");
      out.write("      version    : 'v5.0'\n");
      out.write("    });\n");
      out.write("      \n");
      out.write("    FB.AppEvents.logPageView();   \n");
      out.write("      \n");
      out.write("  };\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("  (function(d, s, id){\n");
      out.write("     var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("     if (d.getElementById(id)) {return;}\n");
      out.write("     js = d.createElement(s); js.id = id;\n");
      out.write("     js.src = \"https://connect.facebook.net/en_US/sdk.js\";\n");
      out.write("     fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("   }(document, 'script', 'facebook-jssdk'));\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("    function  googlelogin()\n");
      out.write("   {\n");
      out.write("\tfunction onSignIn(googleUser) {\n");
      out.write("      var profile = googleUser.getBasicProfile();\n");
      out.write("      console.log('ID: ' + profile.getId());\n");
      out.write("      console.log('Name: ' + profile.getName());\n");
      out.write("      console.log('Image URL: ' + profile.getImageUrl());\n");
      out.write("      console.log('Email: ' + profile.getEmail());\n");
      out.write("      console.log('id_token: ' + googleUser.getAuthResponse().id_token);\n");
      out.write("\n");
      out.write("     //do not post above info to the server because that is not safe.\n");
      out.write("     //ju\n");
      out.write("     //st send the id_token\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      var redirectUrl = 'login';\n");
      out.write("      //using jquery to post data dynamically\n");
      out.write("      var form = $('<form action=\"' + redirectUrl + '\" method=\"post\">' +\n");
      out.write("                          '<input type=\"text\" name=\"id_token\" value=\"' +\n");
      out.write("                           googleUser.getAuthResponse().id_token + '\" />' +\n");
      out.write("                                                                '</form>');\n");
      out.write("                $('body').append(form);\n");
      out.write("                form.submit();\n");
      out.write("         }\n");
      out.write("     }\n");
      out.write("\n");
      out.write("  function login()\n");
      out.write("{\n");
      out.write("    console.log(\"kuch nahi\");\n");
      out.write("    var loginId = document.getElementById(\"loginId\").value;\n");
      out.write("    var password = document.getElementById(\"loginPassword\").value;\n");
      out.write("  \n");
      out.write("    jQuery.ajax({\n");
      out.write("      \n");
      out.write("        type: \"post\",\n");
      out.write("        url:'http://localhost:8083/cdacpal/user/login?loginid='+loginId+'&password='+password,\n");
      out.write("//        data:{data: password},\n");
      out.write("        success:function(responsedata)\n");
      out.write("        {\n");
      out.write("            //alert(\"login Successfully\"+responsedata);\n");
      out.write("            if(responsedata.success==0)\n");
      out.write("            {\n");
      out.write("                alert(responsedata.error);\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                 \n");
      out.write("               alert(responsedata.error+responsedata.userId);\n");
      out.write("                localStorage.setItem(\"userid\",responsedata.userId);\n");
      out.write("                \n");
      out.write("                setTimeout(function(){ window.location = '/CdacPal/index_after_login.jsp'; }, 1000);\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    })\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("         \n");
      out.write("      </script>   \n");
      out.write("         \n");
      out.write("     \n");
      out.write("     \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
