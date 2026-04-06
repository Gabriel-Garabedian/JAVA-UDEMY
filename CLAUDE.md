# CLAUDE.md - Instruções de Memória Persistente

## No início de cada sessão

**Leia sempre os arquivos de memória** para recuperar contexto:

1. `memory/user.md` — informações sobre o usuário
2. `memory/people.md` — pessoas envolvidas no projeto
3. `memory/decisions.md` — decisões tomadas anteriormente
4. `memory/preferences.md` — preferências de trabalho do usuário

Use esse contexto para responder de forma mais relevante e coerente.

## Ao final de cada sessão

**Atualize os arquivos de memória** com novos aprendizados:

- **decisions.md**: registre decisões arquiteturais, escolhas de abordagem, trade-offs
- **people.md**: registre novas pessoas que surgirem no contexto do projeto
- **preferences.md**: registre preferências que o usuário demonstrar durante a conversa (como gosta de trabalhar, o que evitar, o que valorizar)
- **user.md**: registre novas informações sobre o usuário que não tenham lugar nas outras categorias

## Estrutura de memória

```
memory/
├── user.md            # Quem é o usuário, perfil, contexto
├── people.md          # Pessoas envolvidas no projeto
├── preferences.md     # Preferências de estilo, idioma, abordagem
└── decisions.md       # Decisões técnicas e de projeto
```

Mantenha cada arquivo conciso. Use tópicos e tabelas. Evite duplicação de informações.
