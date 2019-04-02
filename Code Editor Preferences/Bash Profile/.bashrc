# Bash Configuration
PS1='\[\033]0;Terminal\007\]' # set window title
PS1="$PS1"'\[\033[32m\]' # change color to green
PS1="$PS1"'\u' # print: 'user'
PS1="$PS1"'\[\033[37m\]' # Change color to white
PS1="$PS1"': ' # print ': '
PS1="$PS1"'\[\033[33m\]' # change color to yellow
PS1="$PS1"'\w' # current working directory

if test -z "$WINELOADERNOEXEC"
then
  GIT_EXEC_PATH="$(git --exec-path 2>/dev/null)"
  COMPLETION_PATH="${GIT_EXEC_PATH%/libexec/git-core}"
  COMPLETION_PATH="${COMPLETION_PATH%/lib/git-core}"
  COMPLETION_PATH="$COMPLETION_PATH/share/git/completion"
  if test -f "$COMPLETION_PATH/git-prompt.sh"
  then
    . "$COMPLETION_PATH/git-completion.bash"
    . "$COMPLETION_PATH/git-prompt.sh"
    PS1="$PS1"'\[\033[36m\]' # change color to cyan
    PS1="$PS1"'`__git_ps1`' # bash function prints: '(git branch)'
  fi
fi
PS1="$PS1"'\[\033[37m\]' # change color to white
PS1="$PS1"'\n' # new line
PS1="$PS1"'$ ' # prompt: '$ '
