package seng201.nunbutblood.models;
/*

 Last Edited 2438 01/04/26 @author cwi184 - "Added clean to-do list with some simple pseudo code"

    Covenant Class --- Main hub to serve as Players 'home-base'
    TODO: Respecify all locations here once set (current are based of UML diagram)
        Attributes (name, faith, activeParty, notActiveParty) :
        ~ name (string) -- Name of the players covenant --Set by main controller?
        ~ faith (int) -- Players current faith --Set by main controller, altered by difficulty  --Alterable through Main
        ~ activeParty (ArrayList) -- Current active players max = 5 --Set by main controller, --Alterable through Covenant line:
        ~ notActiveParty (ArrayList) -- Current in-active players max = 5 --Set by main controller, --Alterable through Covenant line:
        ~ Constructor (name, expeditions, faith) :
        ~ set.name -- Set the current name of the covenant
        ~ set.expeditions -- Set the total expedition counter
        ~ setStartFaith (faith, difficulty) -- Sets the starting faith for the player -call
        ~ Methods (get.name, get.faith)
        ~ get.name (string) -- Get's name from constructor
        ~ get.faith (int) -- Get's faith from constructor

 */