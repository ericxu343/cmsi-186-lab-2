# CMSI 186 Lab 2 Virtual Darts Starter Code

This repository contains some unfinished Java programs that you are complete.

Import this repository into a new repository of your own and write the code according to the lab [instructions](https://cs.lmu.edu/~ray/classes/plab/lab/2/). Use the provided test scripts.

In your new repository, don’t forget to edit this README file, as _your_ repository will certainly not contain any unfinished Java programs.

In this lab, we were supposed to throw darts given the parameters of the number
of people, days, and trials for SharedBirthday are to see how likely two people
share the same birthday. The parameters for PiEstimator was the number of darts
for to see how close the estimate was to PI. For the PiEstimator, we threw an
IllegalArgumentException if number of darts < 1 and would print out the message
"Exactly one argument required" to System.err if there was not an even one argument
and if the argument was not an integer, I would print the message "Argument must
be an integer" to System.err. For SharedBirthday, we threw an IllegalArgumentException
if people < 2, days < 1, and trials < 1. If there wasn't exactly three command line
arguments, it would print "Exactly three arguments required" to System.err. If the
arguments were not in the form of an integer, we would print the message "Arguments
must all be integers" to System.err. I used these numbers to make sure I passed
this test. 

On the command line for SharedBirthday, we would use tests given the parameters.
We would first test by using 4 people, 365 days, and 100000 trials as our
parameters. We would then also test again using a 365 day calendar, but we would
test with a group of 2, 50, or 100 people, and we would use 1000000 trials.

On the command line for PiEstimator, we would use 1000000 darts. Then we would
keep adding darts one by one until it got closer by one decimal point and recorded
that number. We would keep on doing this to see how many darts and at what decimal
place do I get diminishing returns, or regression in the number of correct places.
