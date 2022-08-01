# Calculator With Lexer and Parser  
### calculator with lexer is a normal calculator but it was build using lexer and parser  

---  
## Tokenizer  
**Tokenization** is the process of replacing sensitive data with unique identification symbols that retain all the essential information about the data without compromising its security.
- example:  
```
input: 5 + 3 * 4  
output: [NUM:5.0, PLUS, NUM:3.0, MUL, NUM:4.0]
```

- another example:  
```
input: 4 * (3 + 6)  
output: [NUM:4.0, MUL, LPAREN, NUM:3.0, PLUS, NUM:6.0, RPAREN]
```

---  
## Lexer
**Lexer** turns source code into a stream of tokens. This term is actually a shortened version of “Lexical Analysis”. A token is essentially a representation of each item in the code at a simple level.
- example:
```
input: 5 + 3 * 4  
output: (5 + (3 * 4))
```

- another example:
```
input: 4 * (3 + 6)  
output: (4 * (3 + 6))
```   

---
## Parser
**Parser** is a computer program that breaks down text into recognized strings of characters for further analysis.
- example:
```
input: 5 + 3 * 4  
output: 17
```

- another example:
```
input: 4 * (3 + 6)  
output: 36
``` 