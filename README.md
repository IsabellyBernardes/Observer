## 🧠 O que são os “descendentes” neste padrão Observer?

> Em um sistema com padrão **Observer**, “descendentes” são os **Observers** que recebem notificações **automáticas** sempre que o objeto central (Subject) muda de estado.

No contexto deste projeto:

| Elemento                         | Papel no padrão Observer  | “Descendentes”?                              |
|----------------------------------|----------------------------|----------------------------------------------|
| `EditorDeDados`                 | Subject (sujeito observado) | Não — ele é o **pai**                        |
| `ArmazenadorJson`, `Xml`, `Bd`  | Observers (observadores)   | ✅ **Sim** — são os “descendentes” que reagem |
| Checkboxes                      | Interface de ativação      | Controlam quais descendentes estão ativos     |

### 💡 Analogia visual (estilo árvore)


Cada vez que o **Subject** (`EditorDeDados`) é atualizado, todos os “filhos” ativos (armazenadores) são automaticamente **notificados** e executam suas ações.

### No contexto do padrão Observer, os "descendentes" são os observers ativos — ou seja, os armazenadores que você adiciona dinamicamente e que reagem às atualizações do EditorDeDados.