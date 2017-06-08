CC := javac
CFLAGS := -Wall

SRCFILES := $(wildcard src/*.java)

all: $(SRCFILES:src/%.java=build/classes/%.class)
	$(CC) $(CFLAGS) build/*.o -o build/saida

# build/%.o : src/%.javac
# 	$(CC) $(CFLAGS) -c $< -o $@ -I./inc
#
# .PHONY: clean
# clean:
# 	rm -rf obj/*.o
# 	rm -rf bin/*
#
# run:
# 	bin/saida
