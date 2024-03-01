package br.com.vemprafam.pojo;

import java.util.Date;

public class Funcionario {
	private int re;
	private String nome;
	private Date dataNascimento;
	private double renda;

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(int re, String nome, Date dataNascimento, double renda) {
		super();
		this.re = re;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.renda = renda;
	}

	public int getRe() {
		return re;
	}

	public void setRe(int re) {
		this.re = re;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	@Override
	public String toString() {
		return "Funcionarios [re=" + re + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", renda=" + renda
				+ "]";
	}



}
