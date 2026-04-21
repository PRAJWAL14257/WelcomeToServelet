package com.prajwal;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Nexus Portal - Central Management Servlet
 */
public class NexusServlet extends HttpServlet {
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
        out.println("    <title>Nexus Portal | Dashboard</title>");
        out.println("    <link href='https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@400;600;700&display=swap' rel='stylesheet'>");
        out.println("    <style>");
        out.println("        :root {");
        out.println("            --bg: #0f172a;");
        out.println("            --card: rgba(30, 41, 59, 0.7);");
        out.println("            --accent: #38bdf8;");
        out.println("            --text: #f1f5f9;");
        out.println("            --text-dim: #94a3b8;");
        out.println("        }");
        out.println("        body {");
        out.println("            font-family: 'Plus Jakarta Sans', sans-serif;");
        out.println("            background: radial-gradient(circle at top left, #1e293b, var(--bg));");
        out.println("            color: var(--text);");
        out.println("            margin: 0;");
        out.println("            display: flex;");
        out.println("            justify-content: center;");
        out.println("            align-items: center;");
        out.println("            min-height: 100vh;");
        out.println("        }");
        out.println("        .glass-card {");
        out.println("            background: var(--card);");
        out.println("            backdrop-filter: blur(12px);");
        out.println("            padding: 3rem;");
        out.println("            border-radius: 2rem;");
        out.println("            border: 1px solid rgba(255, 255, 255, 0.1);");
        out.println("            width: 100%;");
        out.println("            max-width: 500px;");
        out.println("            box-shadow: 0 25px 50px -12px rgba(0, 0, 0, 0.5);");
        out.println("            text-align: center;");
        out.println("        }");
        out.println("        .nexus-badge {");
        out.println("            background: rgba(56, 189, 248, 0.1);");
        out.println("            color: var(--accent);");
        out.println("            padding: 0.5rem 1rem;");
        out.println("            border-radius: 2rem;");
        out.println("            font-size: 0.75rem;");
        out.println("            font-weight: 700;");
        out.println("            text-transform: uppercase;");
        out.println("            letter-spacing: 0.1em;");
        out.println("            display: inline-block;");
        out.println("            margin-bottom: 1.5rem;");
        out.println("        }");
        out.println("        h1 { font-size: 2rem; margin: 0 0 0.5rem 0; font-weight: 700; }");
        out.println("        .college { color: var(--text-dim); margin-bottom: 2.5rem; line-height: 1.6; }");
        out.println("        .grid { display: grid; grid-template-columns: 1fr; gap: 1rem; text-align: left; }");
        out.println("        .item { background: rgba(15, 23, 42, 0.5); padding: 1.25rem; border-radius: 1rem; border: 1px solid rgba(255,255,255,0.05); }");
        out.println("        .label { color: var(--text-dim); font-size: 0.75rem; margin-bottom: 0.25rem; }");
        out.println("        .value { color: var(--accent); font-weight: 600; }");
        out.println("        .footer { margin-top: 3rem; font-size: 0.75rem; color: var(--text-dim); }");
        out.println("    </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <div class='glass-card'>");
        out.println("        <span class='nexus-badge'>System Active</span>");
        out.println("        <h1>Nexus Portal</h1>");
        out.println("        <p class='college'>" + (collegeName != null ? collegeName : "Academic Institution") + "</p>");
        out.println("        <div class='grid'>");
        out.println("            <div class='item'>");
        out.println("                <div class='label'>Authorized Administrator</div>");
        out.println("                <div class='value'>" + adminName + "</div>");
        out.println("            </div>");
        out.println("            <div class='item'>");
        out.println("                <div class='label'>Process Identity</div>");
        out.println("                <div class='value'>" + servletName + "</div>");
        out.println("            </div>");
        out.println("        </div>");
        out.println("        <div class='footer'>Nexus Core &copy; 2026. Security Protocol v11.0</div>");
        out.println("    </div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
