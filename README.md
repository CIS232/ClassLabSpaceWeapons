# ClassLabSpaceWeapons
Lab from Class 9/14

Create a `Weapon` class that has an int field for `weight`, appropriate constructors/accessors/modifiers, and a `doDamage` method that takes a String of ship name
and prints "<ship name> damaged".

Create a `LaserCannon` class that extends the `Weapon` class. It should have an int field for `power`, appropriate constructors/accessors/modifiers, and 
a `doDamage` method that overrides the `Weapon`'s `doDamage` method to display "<ship name> took <power> laser damage".

Create a `Torpedo` class that extends the `Weapon` class. It should have int fields for `ammoCount`, `range`, and `explosionPower`. Create 
appropriate constructors/accessors/mutators and a `doDamage` method that overrides the `Weapon`'s `doDamage` method to display "<ship name> took 
explosion damage of <explosionPower>".

Demonstrate the `Torpedo` and `LaserCannon` classes in an application with each doing damage to a ship.
