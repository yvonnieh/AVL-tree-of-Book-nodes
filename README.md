# AVL-tree-of-Book-nodes
Write code using Java or C++ library to build and customize an AVL tree of Book nodes. Using an input file, insert Book nodes and detect imbalance. If imbalance is true, then call the proper rotation function as discussed in the lecture to fix the imbalance condition.
1.  Read AVLNode data from a text file: ISBN Number /n Title /n Author’s first and last name
2.  Create a Book Object; and an AVL node object to be inserted into the AVL tree
3.  At each insert, detect imbalance and fix the AVL tree
4.  Report each imbalance detection and the node where it occurred; and output the message:
    Example Output:
    Imbalance condition occurred at inserting ISBN 12345; fixed in LeftRight Rotation 
    Imbalance condition occurred at inserting ISBN 87654; fixed in Left Rotation 
    Imbalance condition occurred at inserting ISBN 974321; fixed in RightLeft Rotation


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
