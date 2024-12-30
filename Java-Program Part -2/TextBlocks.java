public class TextBlocks
{
    public static void main(String[] args) {
        String s= """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Sample Page</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            margin: 20px;
                            background-color: #f9f9f9;
                        }
                        header {
                            text-align: center;
                            padding: 10px;
                            background-color: #333;
                            color: white;
                        }
                        main {
                            padding: 20px;
                        }
                        footer {
                            text-align: center;
                            margin-top: 20px;
                            padding: 10px;
                            background-color: #333;
                            color: white;
                        }
                    </style>
                </head>
                <body>
                    <header>
                        <h1>Welcome to My Page</h1>
                    </header>
                    <main>
                        <p>This is a simple HTML page with a styled header, main content area, and footer. You can customize it as needed!</p>
                    </main>
                    <footer>
                        <p>&copy; 2024 Vinay's Website</p>
                    </footer>
                </body>
                </html>
                
                """;
        System.out.println(s);
    }
}
