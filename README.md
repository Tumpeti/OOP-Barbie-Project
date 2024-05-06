# OOP Barbie Project

Welcome to Barbieland, a magical place where Barbie and Ken dolls live happily ever after... most of the time. However, sometimes, a Ken doll might venture into the real world, causing havoc in Barbieland. Your task is to write a program to assess the damage and maintain the harmony of Barbieland.

## Project Overview

This project focuses on modeling the inhabitants of Barbieland, including various types of Barbie dolls, Ken dolls, and Allan. The tasks involve determining if Barbieland is doomed due to the patriarchal Kens outnumbering the Stereotypic Barbies and finding the Mojo Dojo Casa House with the most dolls in it.

## Objectives

1. Decide if Barbieland is doomed based on the ratio of patriarchal Kens to Stereotypic Barbies.
2. Find the Mojo Dojo Casa House with the highest number of dolls residing in it.

## Object Model

### Barbie
- Has a name
- Knows which BarbieHouse she lives in
- Can visit other BarbieHouses

### Stereotypic Barbie
- Name is fixed as "Barbie"
- Does not have a job
- Can go to the real world
- If she loses her home, she will go to the real world
- If she goes to the real world, she will acquire the knowledge of real women's struggles

### Special Barbie
- Name is her job name + "Barbie"
- Has a job
- Cannot go to the real world
- Cannot be kicked out from her home

### Ken
- Name is fixed as "Ken"
- Can have a BarbieHouse where he lives
- Can visit other BarbieHouses
- Can lose his home
- His job is "Beach" by default
- Can go to the real world
- After visiting BarbieHouses 3 times, he will go to the real world
- If he goes to the real world, he will learn about the Patriarchy, and his job will be "Patriarchy"

### Allan
- Name is fixed as "Allan"
- He's just Allan. Nothing special

### BarbieHouse
- Has a name, defaults to "Barbie's Dream House"
- Can accommodate dolls

### Barbieland
- Stores every BarbieHouse
- Stores every doll

## Focus on Principles

This project emphasizes the implementation of all SOLID and OOP principles to ensure a well-structured and maintainable codebase.

## Technologies

- Java programming language
- Object-oriented design principles
- SOLID principles

## Tasks

1. Implement classes for Barbie, Stereotypic Barbie, Special Barbie, Ken, Allan, BarbieHouse, and Barbieland.
2. Implement methods to perform the required tasks of assessing the doom of Barbieland and finding the Mojo Dojo Casa House.
3. Write unit tests to ensure the correctness of the implemented functionality.