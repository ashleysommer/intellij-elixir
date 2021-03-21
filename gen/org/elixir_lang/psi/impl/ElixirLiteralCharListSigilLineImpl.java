// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.elixir_lang.psi.ElixirTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.elixir_lang.psi.*;
import com.ericsson.otp.erlang.OtpErlangList;
import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.psi.tree.IElementType;

public class ElixirLiteralCharListSigilLineImpl extends ASTWrapperPsiElement implements ElixirLiteralCharListSigilLine {

  public ElixirLiteralCharListSigilLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElixirVisitor visitor) {
    visitor.visitLiteralCharListSigilLine(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) accept((ElixirVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirLiteralCharListSigilLineBody getLiteralCharListSigilLineBody() {
    return PsiTreeUtil.getChildOfType(this, ElixirLiteralCharListSigilLineBody.class);
  }

  @Override
  @Nullable
  public ElixirSigilModifiers getSigilModifiers() {
    return PsiTreeUtil.getChildOfType(this, ElixirSigilModifiers.class);
  }

  @Override
  public @NotNull List<Integer> addEscapedCharacterCodePoints(@Nullable List<Integer> codePointList, @NotNull ASTNode child) {
    return ElixirPsiImplUtil.addEscapedCharacterCodePoints(this, codePointList, child);
  }

  @Override
  public @NotNull List<Integer> addEscapedEOL(@Nullable List<Integer> maybeCodePointList, @NotNull ASTNode child) {
    return ElixirPsiImplUtil.addEscapedEOL(this, maybeCodePointList, child);
  }

  @Override
  public @NotNull List<Integer> addFragmentCodePoints(@Nullable List<Integer> codePointList, @NotNull ASTNode child) {
    return ElixirPsiImplUtil.addFragmentCodePoints(this, codePointList, child);
  }

  @Override
  public @NotNull List<Integer> addHexadecimalEscapeSequenceCodePoints(@Nullable List<Integer> codePointList, @NotNull ASTNode child) {
    return ElixirPsiImplUtil.addHexadecimalEscapeSequenceCodePoints(this, codePointList, child);
  }

  @Override
  public Body getBody() {
    return ElixirPsiImplUtil.getBody(this);
  }

  @Override
  public IElementType getFragmentType() {
    return ElixirPsiImplUtil.getFragmentType(this);
  }

  @Override
  public @Nullable Integer indentation() {
    return ElixirPsiImplUtil.indentation(this);
  }

  @Override
  public @NotNull OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

  @Override
  public @NotNull OtpErlangObject quote(@NotNull OtpErlangObject quotedContent) {
    return ElixirPsiImplUtil.quote(this, quotedContent);
  }

  @Override
  public @NotNull OtpErlangObject quoteBinary(OtpErlangList metadata, List<OtpErlangObject> argumentList) {
    return ElixirPsiImplUtil.quoteBinary(this, metadata, argumentList);
  }

  @Override
  public @NotNull OtpErlangObject quoteEmpty() {
    return ElixirPsiImplUtil.quoteEmpty(this);
  }

  @Override
  public @NotNull OtpErlangObject quoteInterpolation(ElixirInterpolation interpolation) {
    return ElixirPsiImplUtil.quoteInterpolation(this, interpolation);
  }

  @Override
  public @NotNull OtpErlangObject quoteLiteral(List<Integer> codePointList) {
    return ElixirPsiImplUtil.quoteLiteral(this, codePointList);
  }

  @Override
  public @NotNull String sigilDelimiter() {
    return ElixirPsiImplUtil.sigilDelimiter(this);
  }

  @Override
  public char sigilName() {
    return ElixirPsiImplUtil.sigilName(this);
  }

  @Override
  public char terminator() {
    return ElixirPsiImplUtil.terminator(this);
  }

}
