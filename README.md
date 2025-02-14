# Connect-4-in-Java
# Connect 4 Game

## Overview
This is a **Java-based** implementation of the classic **Connect 4** game. The game allows two players to take turns dropping their pieces into a 7x6 grid, aiming to connect four pieces in a row, column, or diagonal to win.

## Features
- **Two-player mode** (Local multiplayer)
- **Command-line version** (if applicable)
- **Automatic win detection** (horizontal, vertical, and diagonal)
- **Error handling** for invalid moves

## How to Play
1. **Run the program** using Java.
2. Players take turns choosing a column (1-7) to drop their piece.
3. The game checks for a winning condition after each move.
4. The first player to connect 4 in a row, column, or diagonal **wins**.
5. If the grid is full with no winner, the game **ends in a draw**.

## Installation & Execution
### Prerequisites
- Java Development Kit (JDK) 8 or later installed.

### Steps to Run
#### If using command line:
1. Clone or download this repository:
   ```sh
   git clone https://github.com/Abhia2531/connect-4-in-Java.git
   cd connect-4-in-Java
   ```
2. Compile the Java files:
   ```sh
   javac Connect4.java
   ```
3. Run the game:
   ```sh
   java Connect4
   ```

#### If using an IDE (e.g., IntelliJ, Eclipse):
1. Open the project in your preferred Java IDE.
2. Build and run `Connect4.java`.

## Game Rules
- Players take turns placing a piece in one of the 7 columns.
- The piece falls to the lowest available row in that column.
- The first player to **connect 4** in any direction wins.
- If the grid fills up with no winner, the game ends in a **draw**.

## Future Enhancements (To-Do)
- Implement an **AI opponent** for single-player mode.
- Add a **GUI version** with Java Swing/JavaFX.
- Improve **game animations and effects**.
- Add an **undo feature**.

## Contributing
Feel free to fork this repository and submit **pull requests** if you’d like to contribute improvements!

