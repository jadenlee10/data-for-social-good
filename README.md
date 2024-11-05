# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As an NBA data analyzer, <br> 
> I want to figure out the different stats of the NBA players throughout all of the different teams, <br> 
> so that I can give these stats to people so that they know who is performing well and who is not and hopefully off of this, make money. 

## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 

Dataset: https://www.kaggle.com/datasets/joebeachcapital/nba-player-statistics
- **Player** (String) - player names
- **Team** (String) - teams the players are on
- **Position** (String) - the position these players play
- **PTS** (Double) - the average points of that player


## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML Diagram for my project](![Screenshot 2024-11-04 174901](https://github.com/user-attachments/assets/71e8f343-4287-40f8-a2e6-b339cd2e5397)

## Description 

In this project, we created our own User Stories to use for our code later on. My partner and I chose to work with NBA statistics as we are both into sports. We used a dataset from Kaggle and wanted to find out which NBA player had a better performance. We imported our datasets into code.org and used it to create our interactive program. We created two different classes that carried out most of the functions of the program by using instance variables, constructor methods, etc. We used a scanner class to make it interactive and this method basically asks the user in the console to type in the player they are looking for and if not found, the program will just end. However, if the name is found, statistics and data about the player will display into the console which is what our User Story wanted to achieve.
