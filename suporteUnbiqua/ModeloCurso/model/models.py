# residuos/models.py

from django.db import models

class Curso(models.Model):
    nome = models.CharField(max_length=100)
    duracao = models.IntegerField(help_text="Duração em semestres")
    coordenador = models.CharField(max_length=100)
    unidade = models.CharField(max_length=100)

    def __str__(self):
        return f"{self.nome} ({self.unidade})"
