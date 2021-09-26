# TicTacToe-MasterGame
<h3>
A TicTacToe Game built for android devices having amazing features such as inbuilt scoreboard to track the game progress, new custom game Modes based on setting time for each player(and also setting time for the total game),playing against a computer engine and so on.
  </h3>

[![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/arcAman07/TicTacToe_MasterGame?logo=github&style=for-the-badge)](https://github.com/arcAman07/) 
[![GitHub last commit](https://img.shields.io/github/last-commit/arcAman07/TicTacToe_MasterGame?style=for-the-badge&logo=git)](https://github.com/arcAman07/) 
[![GitHub stars](https://img.shields.io/github/stars/arcAman07/TicTacToe_MasterGame?style=for-the-badge)](https://github.com/arcAman07/TicTacToe_MasterGame/stargazers) 
[![My stars](https://img.shields.io/github/stars/arcAman07?affiliations=OWNER%2CCOLLABORATOR&style=for-the-badge&label=My%20stars)](https://github.com/arcAman07/TicTacToe_MasterGame/stargazers) 
[![GitHub forks](https://img.shields.io/github/forks/arcAman07/TicTacToe_MasterGame?style=for-the-badge&logo=git)](https://github.com/arcAman07/TicTacToe_MasterGame/network)
[![Code size](https://img.shields.io/github/languages/code-size/arcAman07/TicTacToe_MasterGame?style=for-the-badge)](https://github.com/Apurva-tech/arcAman07)
[![Languages](https://img.shields.io/github/languages/count/arcAman07/TicTacToe_MasterGame?style=for-the-badge)](https://github.com/arcAman07/TicTacToe_MasterGame)
[![Top](https://img.shields.io/github/languages/top/arcAman07/TicTacToe_MasterGame?style=for-the-badge&label=Top%20Languages)](https://github.com/arcAman07/TicTacToe_MasterGame)
[![Issues](https://img.shields.io/github/issues/arcAman07/TicTacToe_MasterGame?style=for-the-badge&label=Issues)](https://github.com/arcAman07/TicTacToe_MasterGame)
[![Watchers](	https://img.shields.io/github/watchers/arcAman07/TicTacToe_MasterGame?label=Watch&style=for-the-badge)](https://github.com/arcAman07/TicTacToe_MasterGame/)

## Home Page Layout
![image](https://user-images.githubusercontent.com/76823502/134799298-f9dfd494-a3c2-42b9-914d-619dbda07867.png)


## Features
<h3>This Tic-Tac-Toe game currently has three game modes:</h3>
  <h4>
    1) 1 v 1 against a human player with inbuilt scoreboard system which keeps on updating as the game progresses, cool animations, an alert system (toast) which alerts players about the outcome of the game as it is finished and users can continue the battle by clicking the Play Again button as the game finishes.</h4>
    <img src = "https://user-images.githubusercontent.com/76823502/134799686-77d44d1c-edd7-4b32-86da-e7f1ec43f00e.png">
    <h4>
    2) 1 v 1 Custom Game Modes: These Custom Game Modes are shown as below. In each of these game mode the games will last 10,15 or 20 seconds as per the user's choice. </h4>
  <img src="https://user-images.githubusercontent.com/76823502/134803004-4d38d7fb-9c45-47ca-8bc8-d93ee86846d9.png">
  <h4>As soon as the user presses the START Button the game and the timer automatically starts.</h4>
  <img src="https://user-images.githubusercontent.com/76823502/134803152-2f54cb5a-5620-4a4f-a573-8dc269254768.png">
  <h4>As soon as the game finishes the timer stops automatically, updating the scoreboard and alerting the winner of the game as a toast message.</h4>
  <img src = "https://user-images.githubusercontent.com/76823502/134803452-01f531e5-7892-4aef-b887-9c9cdf2fe76b.png">
  <h4> If the game is not finished and the time runs out, then the game will be considered a Draw and scoreboard will be accordingly updated. The user will be prompted to PLAY AGAIN or return to the HOME PAGE.</h4>
  <img src = "https://user-images.githubusercontent.com/76823502/134803639-e16520ac-2afa-4ea3-af44-1e987990982d.png">
<h4>Currently these are the timer available in the custom game mode, will be planning to add a user custom game mode where users will be able to set the time of the game.</h4>
<h4>
  i) 10 seconds<br><br>
  ii)15 seconds<br><br>
  iii)20 seconds<br><br>
  
  </h4>
  <h4>
  3) 1 v 1 Computer Engine Mode: Currently this mode is not fully implemented as the game are not stored in the database and a ML model is not trained using that data.
   Currently in this game Mode after the user's response, the computer engine is playing a random move. It is under development and should be developed soon.
  </h4>
  
## Tech Stack
 <h4> 
  1)Built entirely using Android Studio. <br>
  2)Plan to use SQLite/mongodb database to store the game played by the user and connecting it to a node server(using Express.js framework).<br>
  3)Tensorflow to build a ML model around the game which can be used by the computer engine.<br>
  <img src = "https://user-images.githubusercontent.com/76823502/134804006-088a6813-6e4b-4525-995a-969c12197111.png">

  </h4>

 
 ## Future Enhancements
  <h4>
  1) Improvement in the UI of the application.<br><br>
  2) Adding custom User input game modes where users can set the duration of the game.<br><br>
  3) Using mongodb/SQLite database to store the games and handling that data with node server(using Express.js)<br><br>
  4) Training a ML model using neural network from the games and corresponding resullts collected(dynamic model).<br><br>
  5) Implementing the computer engine mode based on the trained ML model.<br><br>
  6) Introducing move takebacks.
  </h4>
## Try it Out!
  1) `git clone https://github.com/arcAman07/TicTacToe_MasterGame.git` and run it in Android Studio.<br><br>
  2) You can also copy the url 'https://github.com/arcAman07/TicTacToe_MasterGame.git' and paste it in Android Studio under 'Get Project Using Version Control'.<br><br>
  3) You can then run this application either in your emulator( virtual device) or your smartphone.<br><br>


