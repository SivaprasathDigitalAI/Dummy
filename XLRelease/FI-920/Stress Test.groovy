// Exported from:        http://LAPTOP-9C20LTLG:5516/#/templates/Folder0d3ef78ee4b7408baa8b1f5c3df7e6db-Releasee1c46f20c3cc4829a3d4a16fc1d57b45/code
// Release version:      22.0.0-20211220-123974
// Date created:         Wed Feb 16 15:45:07 IST 2022

xlr {
  template('Stress Test') {
    folder('FI-920')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-11T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}nohmyN5kX9L5T6ybOGbw0hLZHQPuIORfUzfCTTm0bo8='
    phases {
      phase('New Phase') {
        tasks {
          parallelGroup('PG') {
            tasks {
              groovyScript('G1') {
                ignoreScriptVariableInterpolation true
                script (['''\
def releaseIds = []
for(int i in 1..10) {
    
def createdRelease = xlr {
  release("FI-920") {
    folder('FI-920')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          parallelGroup('PG') {
            tasks {
              groovyScript('G1') {
                ignoreScriptVariableInterpolation true
                script ([\'\'\'\\
def GroovyScriptRelease = xlr {
  release("Parent Permission check Release ENG-3000") {
    folder('ENG-3000')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          parallelGroup('Parallel1') {
            tasks {
              groovyScript('Groovy one') {
                ignoreScriptVariableInterpolation true
                script ([\\'\\'\\'\\\\
xlr {
  release("Permission Check Release from GG1 Task ENG3001") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-02T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    folder('ENG-3001')
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
  }
}
\\'\\'\\'])
              }
              groovyScript('Groovy one (copy)') {
                ignoreScriptVariableInterpolation true
                script ([\\'\\'\\'\\\\
xlr {
  release("child Permission Check Release From GG1 Task Override ENG-3000") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-02T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#edit_security'
      }
    }
  }
}
\\'\\'\\'])
              }
            }
          }
        }
      }
    }
    
  }
}

def globalGroovyRelease = xlr {
  release("Global Template from Task GG1 WT - ENG-3001") {
    folder('ENG-3001')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          groovyScript('Global Groovy') {
            ignoreScriptVariableInterpolation true
            script ([\\'\\'\\'\\\\
xlr {
  release('Should be created in ENG-3001') {
    variables {
      stringVariable('Template.var1') {
        description 'Variable One'
        value 'var1'
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#task_transition', 'release#edit_task_attachments'
      }
      team('Template Owner') {
        members 'admin'
        permissions 'template#create_release_other_folder', 'template#edit', 'template#lock_task', 'template#view', 'template#edit_security', 'template#create_release', 'template#edit_triggers', 'template#edit_precondition', 'template#edit_failure_handler', 'release#edit'
      }
    }
  }
}
\\'\\'\\'])
          }
        }
      }
    }
    
  }
}

releaseApi.start(GroovyScriptRelease.id)
releaseApi.start(globalGroovyRelease.id)
\'\'\'])
              }
              groovyScript('G2') {
                ignoreScriptVariableInterpolation true
                script ([\'\'\'\\
def GroovyScriptRelease = xlr {
  release("Release in FI-920") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          parallelGroup('Parallel1') {
            tasks {
              groovyScript('Groovy one') {
                ignoreScriptVariableInterpolation true
                script ([\\'\\'\\'\\\\
xlr {
  release("Permission Check Release from GG1 Task ENG3001") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    folder('ENG-3001')
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
  }
}
\\'\\'\\'])
              }
              groovyScript('Groovy one (copy)') {
                ignoreScriptVariableInterpolation true
                script ([\\'\\'\\'\\\\
xlr {
  release("child Permission Check Release From GG1 Task Override FI-920") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#edit_security'
      }
    }
  }
}
\\'\\'\\'])
              }
            }
          }
        }
      }
    }
    
  }
}

releaseApi.start(GroovyScriptRelease.id)
\'\'\'])
              }
            }
          }
        }
      }
    }
    
  }
}

releaseIds.add(createdRelease.id)
    
}

releaseIds.each{
    id -> releaseApi.start(id)
}
'''])
              }
              groovyScript('G12') {
                ignoreScriptVariableInterpolation true
                script (['''\
def releaseIds = []
for(int i in 11..20) {
    
def createdRelease = xlr {
  release("FI-920") {
    folder('FI-920')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          parallelGroup('PG') {
            tasks {
              groovyScript('G1') {
                ignoreScriptVariableInterpolation true
                script ([\'\'\'\\
def GroovyScriptRelease = xlr {
  release("Parent Permission check Release ENG-3000") {
    folder('ENG-3000')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          parallelGroup('Parallel1') {
            tasks {
              groovyScript('Groovy one') {
                ignoreScriptVariableInterpolation true
                script ([\\'\\'\\'\\\\
xlr {
  release("Permission Check Release from GG1 Task ENG3001") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-02T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    folder('ENG-3001')
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
  }
}
\\'\\'\\'])
              }
              groovyScript('Groovy one (copy)') {
                ignoreScriptVariableInterpolation true
                script ([\\'\\'\\'\\\\
xlr {
  release("child Permission Check Release From GG1 Task Override ENG-3000") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-02T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#edit_security'
      }
    }
  }
}
\\'\\'\\'])
              }
            }
          }
        }
      }
    }
    
  }
}

def globalGroovyRelease = xlr {
  release("Global Template from Task GG1 WT - ENG-3001") {
    folder('ENG-3001')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          groovyScript('Global Groovy') {
            ignoreScriptVariableInterpolation true
            script ([\\'\\'\\'\\\\
xlr {
  release('Should be created in ENG-3001') {
    variables {
      stringVariable('Template.var1') {
        description 'Variable One'
        value 'var1'
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#task_transition', 'release#edit_task_attachments'
      }
      team('Template Owner') {
        members 'admin'
        permissions 'template#create_release_other_folder', 'template#edit', 'template#lock_task', 'template#view', 'template#edit_security', 'template#create_release', 'template#edit_triggers', 'template#edit_precondition', 'template#edit_failure_handler', 'release#edit'
      }
    }
  }
}
\\'\\'\\'])
          }
        }
      }
    }
    
  }
}

releaseApi.start(GroovyScriptRelease.id)
releaseApi.start(globalGroovyRelease.id)
\'\'\'])
              }
              groovyScript('G2') {
                ignoreScriptVariableInterpolation true
                script ([\'\'\'\\
def GroovyScriptRelease = xlr {
  release("Release in FI-920") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          parallelGroup('Parallel1') {
            tasks {
              groovyScript('Groovy one') {
                ignoreScriptVariableInterpolation true
                script ([\\'\\'\\'\\\\
xlr {
  release("Permission Check Release from GG1 Task ENG3001") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    folder('ENG-3001')
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
  }
}
\\'\\'\\'])
              }
              groovyScript('Groovy one (copy)') {
                ignoreScriptVariableInterpolation true
                script ([\\'\\'\\'\\\\
xlr {
  release("child Permission Check Release From GG1 Task Override FI-920") {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2022-02-09T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}fJ0J4OM39H+sVGGR5ehf5yXlGmm3fLI7hRDbrYJk+W0='
    phases {
      phase('New Phase') {
        tasks {
          manual('MT') {
            
          }
          script('HS') {
            
          }
        }
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#edit_security'
      }
    }
  }
}
\\'\\'\\'])
              }
            }
          }
        }
      }
    }
    
  }
}

releaseApi.start(GroovyScriptRelease.id)
\'\'\'])
              }
            }
          }
        }
      }
    }
    
  }
}

releaseIds.add(createdRelease.id)
    
}

releaseIds.each{
    id -> releaseApi.start(id)
}
'''])
              }
            }
          }
        }
      }
    }
    
  }
}