package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String adminName = config.getInitParameter("adminName");
        String collegeName = config.getInitParameter("collegeName");
        String servletName = config.getServletName();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("    <meta charset='UTF-8'>");
        out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("    <title>College Portal | Welcome</title>");
        out.println("    <link href='https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap' rel='stylesheet'>");
        out.println("    <style>");
        out.println("        :root {");
        out.println("            --primary: #2563eb;");
        out.println("            --bg: #f8fafc;");
        out.println("            --text: #1e293b;");
        out.println("        }");
        out.println("        body {");
        out.println("            font-family: 'Poppins', sans-serif;");
        out.println("            background-color: var(--bg);");
        out.println("            color: var(--text);");
        out.println("            margin: 0;");
        out.println("            display: flex;");
        out.println("            justify-content: center;");
        out.println("            align-items: center;");
        out.println("            min-height: 100vh;");
        out.println("        }");
        out.println("        .card {");
        out.println("            background: white;");
        out.println("            padding: 3rem;");
        out.println("            border-radius: 1.5rem;");
        out.println("            box-shadow: 0 10px 25px rgba(0,0,0,0.05);");
        out.println("            max-width: 650px;");
        out.println("            width: 90%;");
        out.println("            text-align: center;");
        out.println("            border: 1px solid #e2e8f0;");
        out.println("        }");
        out.println("        .logo {");
        out.println("            width: 70px;");
        out.println("            height: 70px;");
        out.println("            background: linear-gradient(135deg, var(--primary), #60a5fa);");
        out.println("            border-radius: 1.2rem;");
        out.println("            margin: 0 auto 1.5rem;");
        out.println("            display: flex;");
        out.println("            align-items: center;");
        out.println("            justify-content: center;");
        out.println("            color: white;");
        out.println("            font-size: 1.8rem;");
        out.println("            font-weight: 600;");
        out.println("        }");
        out.println("        h1 {");
        out.println("            font-size: 1.8rem;");
        out.println("            margin-bottom: 0.5rem;");
        out.println("            color: #0f172a;");
        out.println("        }");
        out.println("        .subtitle {");
        out.println("            color: #64748b;");
        out.println("            margin-bottom: 2.5rem;");
        out.println("            font-size: 1.1rem;");
        out.println("        }");
        out.println("        .info-grid {");
        out.println("            display: grid;");
        out.println("            grid-template-columns: 1fr 1fr;");
        out.println("            gap: 1.5rem;");
        out.println("            text-align: left;");
        out.println("        }");
        out.println("        .info-box {");
        out.println("            background: #f1f5f9;");
        out.println("            padding: 1.2rem;");
        out.println("            border-radius: 1rem;");
        out.println("            border: 1px solid #cbd5e1;");
        out.println("        }");
        out.println("        .label {");
        out.println("            font-size: 0.7rem;");
        out.println("            text-transform: uppercase;");
        out.println("            letter-spacing: 0.1em;");
        out.println("            color: #64748b;");
        out.println("            font-weight: 600;");
        out.println("            margin-bottom: 0.4rem;");
        out.println("        }");
        out.println("        .value {");
        out.println("            font-weight: 600;");
        out.println("            color: #334155;");
        out.println("            font-size: 1rem;");
        out.println("        }");
        out.println("        .footer {");
        out.println("            margin-top: 3rem;");
        out.println("            font-size: 0.8rem;");
        out.println("            color: #94a3b8;");
        out.println("            border-top: 1px solid #f1f5f9;");
        out.println("            padding-top: 1.5rem;");
        out.println("        }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class='card'>");
        out.println("        <div class='logo'>CP</div>");
        out.println("        <h1>Welcome to " + (collegeName != null ? collegeName : "Our Institution") + "</h1>");
        out.println("        <p class='subtitle'>Hello, " + (adminName != null ? adminName : "Admin") + "! Your portal is ready.</p>");
        out.println("        <div class='info-grid'>");
        out.println("            <div class='info-box'>");
        out.println("                <div class='label'>Admin Name</div>");
        out.println("                <div class='value'>" + adminName + "</div>");
        out.println("            </div>");
        out.println("            <div class='info-box'>");
        out.println("                <div class='label'>Servlet Name</div>");
        out.println("                <div class='value'>" + servletName + "</div>");
        out.println("            </div>");
        out.println("        </div>");
        out.println("        <div class='footer'>");
        out.println("            &copy; 2026 Powered by " + servletName + " Core Engine");
        out.println("        </div>");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
