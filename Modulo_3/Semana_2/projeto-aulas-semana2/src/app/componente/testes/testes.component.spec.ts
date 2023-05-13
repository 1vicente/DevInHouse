import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestesComponent } from './testes.component';

describe('TestesComponent', () => {
  let component: TestesComponent;
  let fixture: ComponentFixture<TestesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TestesComponent]
    });
    fixture = TestBed.createComponent(TestesComponent); //  mock de typescript
    component = fixture.componentInstance; // instância do componente
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('Teste variavel app="terra"', () => {
    expect(component.app).toEqual('terra')
  })
});
