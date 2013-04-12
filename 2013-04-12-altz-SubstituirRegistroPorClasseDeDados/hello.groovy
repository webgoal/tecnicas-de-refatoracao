// Print
println "hello, world"

// Iteration
for (arg in this.args ) {
  println "Argument:" + arg;
}

//Iteration with closures
args.each{ arg -> println "Argument: " + arg}

// Lists
def list = [1, 2, 'hello', new java.util.Date()]
assert list.size() == 4
assert list.get(2) == 'hello'
assert list[2] == 'hello'

[1,3,7].each{item -> println "${item}"}

// Maps
def map = ['name':'James', 'location':'London']
assert map.size() == 2
assert map.get('name') == 'James'
assert map['name'] == 'James'

['name':'Jao', 'surname':'gonco'].each{ key, value -> println "${key}: ${value}" }

// safe navigation 
def foo = null
print foo?.something?.method()

