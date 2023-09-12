#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

#define VERSION "0.0.1"

typedef char *string;

void help_page()
{
    printf("alap v%s\n\n", VERSION);
    printf("Usage: alap <template_id> [option]\n\n");
    printf("Available options:\n\n");
    puts("-h, --help\tShows this help");
    puts("-v, --version\tVersion info");
    puts("--stdout\tWon't create source file, prints the result to stdout");
    puts("\nAvailable templates:\n");
    puts("* c\t - C source code [main.c]");
    puts("* java\t - Java source code [Main.java]");
    puts("* py\t - Python source code [main.py]");
}

void write_file(string type, string snippet)
{
    char filename[20];
    if (strcmp(type, "java") == 0)
    {
        strcpy(filename, "Main.");
    }
    else
    {
        strcpy(filename, "main.");
    }
    strcat(filename, type);

    if (access(filename, F_OK) == -1)
    {
        FILE *fp = fopen(filename, "w");
        if (fp != NULL)
        {
            fprintf(fp, "%s", snippet);
            printf("\"%s\" has been created\n", filename);
            fclose(fp);
        }
        else
        {
            printf("Failed to create \"%s\"!\n", filename);
        }
    }
    else
    {
        printf("\"%s\" already exists!\n", filename);
    }
}

void check_option(string snippet, string template, string option)
{
    if (option == NULL)
    {
        write_file(template, snippet);
    }
    else if (strcmp(option, "--stdout") == 0)
    {
        printf("%s", snippet);
    }
    else
    {
        printf("Invalid option. Check help for usage!");
    }
}

int main(int argc, string argv[])
{
    string JAVA_SNIPPET = "class Main \n{\n\tpublic static void main(String[] args) \n\t{\n\t\tSystem.out.println(\"Hello world!\");\n\t}\n}";
    string C_SNIPPET = "#include <stdio.h>\n\nint main()\n{\n\tprintf(\"Hello world!\");\n\treturn 0;\n}";
    string PYTHON_SNIPPET = "#!/usr/bin/env python3\n\ndef main():\n\tprint(\"Py3\")\n\nif __name__ == \"__main__\":\n\tmain()\n";

    if (argc == 1 || strcmp(argv[1], "-h") == 0 || strcmp(argv[1], "--help") == 0)
    {
        help_page();
        exit(0);
    }
    else if (strcmp(argv[1], "-v") == 0 || strcmp(argv[1], "--version") == 0)
    {
        printf("alap v%s", VERSION);
        exit(0);
    }
    else if (strcmp(argv[1], "java") == 0)
    {
        check_option(JAVA_SNIPPET, argv[1], argv[2]);
    }
    else if (strcmp(argv[1], "c") == 0)
    {
        check_option(C_SNIPPET, argv[1], argv[2]);
    }
    else if (strcmp(argv[1], "py") == 0)
    {
        check_option(PYTHON_SNIPPET, argv[1], argv[2]);
    }
    else
    {
        printf("Invalid provided option or template id. Please try again!");
        exit(1);
    }

    return 0;
}