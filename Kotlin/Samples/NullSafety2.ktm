1// returns null if...
2// - foo() returns null,
3// - or if foo() is non-null, but bar() returns null,
4// - or if foo() and bar() are non-null, but baz() returns null.
5// vice versa, return value is non-null if and only if foo(), bar() and baz() are non-null
6foo()?.bar()?.baz()
