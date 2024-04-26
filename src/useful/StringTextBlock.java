package useful;

public class StringTextBlock {

	public static void main(String[] args) {
		// """ 찍고 한줄 내리기
		String strBlock = """

				This is a Text block


				 """;

		String a = """
				ddddd
				""";

		// html, json 문자열을 만드는데 유용하게 사용할 수 있음
	}
	String jsonText = """
			{
				  "userId": 1,
				  "id": 1,
				  "title": "delectus aut autem",
				  "completed": false
				}
					""";
	
	String a = """
			fdfdfdfdfdf<><><><><><><><>>><><<<<>>>><<>><<><><<>><><><><
			
			""";

	String htmlText = """

			<!doctype html>
			<html dir="ltr" lang="ko"
			    chrome-refresh-2023>
			  <head>
			    <meta charset="utf-8">
			    <title>새 탭</title>
			    <style>
			      body {
			        background: #FFFFFF;
			        margin: 0;
			      }

			      #backgroundImage {
			        border: none;
			        height: 100%;
			        pointer-events: none;
			        position: fixed;
			        top: 0;
			        visibility: hidden;
			        width: 100%;
			      }

			      [show-background-image] #backgroundImage {
			        visibility: visible;
			      }
			    </style>
			  </head>
			  <body>
			    <iframe id="backgroundImage" src=""></iframe>
			    <ntp-app></ntp-app>
			    <script type="module" src="new_tab_page.js"></script>
			    <link rel="stylesheet" href="chrome://resources/css/text_defaults_md.css">
			    <link rel="stylesheet" href="chrome://theme/colors.css?sets=ui,chrome">
			    <link rel="stylesheet" href="shared_vars.css">
			  </body>
			</html>
						""";
}
